eventCompileStart = {

  // Compile javascript
  def jsBaseDir = "${grailsSettings.baseDir}/web-app/js"
  doIfUpToDate(srcDir: "${jsBaseDir}/src/", srcIncludes: "**/*.js", targetFile: "${jsBaseDir}/pkg/main.js", desc: "Javascript") {
    def requireJsDir = "${grailsSettings.baseDir}/lib/require-optimize"
    ant.path(id: "rhinoClasspath") {
      fileset(dir: requireJsDir, includes: "*.jar")
    }

    ant.java(classname: "org.mozilla.javascript.tools.shell.Main", classpathref: "rhinoClasspath", failonerror: true) {
      arg(value: "${requireJsDir}/r.js")
      arg(value: "-o")
      arg(value: "${grailsSettings.baseDir}/buildconfig.js")
    }
  }

  def cssBaseDir = "${grailsSettings.baseDir}/web-app/css"

  doIfUpToDate(srcDir: "${cssBaseDir}/src/", srcIncludes: "**/*.scss", targetFile: "${cssBaseDir}/pkg/screen.css", desc: "CSS") {
    ant.exec(executable: "compass") {
      arg(value: "compile")
    }
  }
}

def doIfUpToDate(options, closure) {
  def origUptodate = ant.project.properties.isUptodate
  ant.uptodate(property: "isUptodate", value: false, targetfile: options.targetFile) {
    srcfiles(dir: options.srcDir, includes: options.srcIncludes)
  }

  if (!ant.project.properties.isUptodate) {
    println "\n ** Compiling ${options.desc}."
    closure.call()
  } else {
    println "\n ** ${options.desc} is up-to-date, not compiling."
  }
  ant.property(name: "isUptodate", value: origUptodate)
}
