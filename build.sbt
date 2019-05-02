import sbtcrossproject.CrossPlugin.autoImport.crossProject

val sharedSettings = Seq(
  scalaVersion := "2.12.6",
  mainClass in (Compile, run) := Some("com.example.Main"),
)

val mainclassbug = crossProject(JSPlatform, JVMPlatform)
  .settings(sharedSettings)
  .jsSettings(scalaJSUseMainModuleInitializer := true)
