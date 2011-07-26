eventCompileStart = {

  // Compile javascript
  def jsBaseDir = "${grailsSettings.baseDir}/web-app/js"
  ant.uptodate(property: "jsIsUptodate", value: false, targetfile: "${jsBaseDir}/pkg/main.js") {
    srcfiles(dir: "${jsBaseDir}/src/", includes: "**/*.js")
  }

  if (!ant.project.properties.jsIsUptodate) {
    println "\n ** Compiling Javascript."

    def requireJsDir = "${grailsSettings.baseDir}/lib/require-optimize"
    ant.path(id: "rhinoClasspath") {
      fileset(dir: requireJsDir, includes: "*.jar")
    }

    ant.java(classname: "org.mozilla.javascript.tools.shell.Main", classpathref: "rhinoClasspath", failonerror: true) {
      arg(value: "${requireJsDir}/r.js")
      arg(value: "-o")
      arg(value: "${grailsSettings.baseDir}/buildconfig.js")
    }
  } else {
    println "\n ** Javascript is up-to-date, not compiling."
  }

  def cssBaseDir = "${grailsSettings.baseDir}/web-app/css"

  ant.uptodate(property: "cssIsUptodate", value: false, targetfile: "${cssBaseDir}/pkg/screen.css") {
    srcfiles(dir: "${cssBaseDir}/src/", includes: "**/*.scss")
  }

  if (!ant.project.properties.cssIsUptodate) {
    println "\n ** Compiling CSS."

    ant.exec(executable: "compass") {
      arg(value: "compile")
    }
  } else {
    println "\n ** CSS is up-to-date, not compiling."
  }
}

