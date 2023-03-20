plugins {
  id("java-gradle-plugin")
  kotlin("jvm")
  id("com.github.gmazzo.buildconfig")
  `maven-publish`
}

dependencies {
  implementation(kotlin("gradle-plugin-api"))
}

buildConfig {
  val project = project(":fir-plugin")
  packageName(project.group.toString())
  buildConfigField("String", "KOTLIN_PLUGIN_ID", "\"${rootProject.extra["kotlin_plugin_id"]}\"")
  buildConfigField("String", "KOTLIN_PLUGIN_GROUP", "\"${project.group}\"")
  buildConfigField("String", "KOTLIN_PLUGIN_NAME", "\"${project.name}\"")
  buildConfigField("String", "KOTLIN_PLUGIN_VERSION", "\"${project.version}\"")
}

gradlePlugin {
  plugins {
    create("fir2MlirPlugin") {
      id = rootProject.extra["kotlin_plugin_id"] as String
      displayName = "Kotlin Ir Plugin Fir2Mlir"
      description = "Kotlin Ir Plugin Fir2Mlir"
      implementationClass = "my.kotlin.fir2mlir.Fir2MlirGradlePlugin"
    }
  }
}
