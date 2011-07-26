eventCompileStart = {
  def requireJsDir = "${grailsSettings.baseDir}/lib/require-optimize"

  ant.path(id: "rhinoClasspath") {
    fileset(dir: requireJsDir, includes: "*.jar")
  }
  
  ant.java(classname: "org.mozilla.javascript.tools.shell.Main", classpathref: "rhinoClasspath") {
    arg(value: "${requireJsDir}/r.js")
    arg(value: "-o")
    arg(value: "${grailsSettings.baseDir}/buildconfig.js")
  }
}

// Allow tomcat to follow symlinks
eventConfigureTomcat = { tomcat ->
  def ctx = tomcat.host.findChild(serverContextPath)
  ctx.allowLinking = true
}
