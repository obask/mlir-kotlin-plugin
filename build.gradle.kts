buildscript {
  extra["kotlin_plugin_id"] = "my.kotlin.fir2mlir.fir-plugin"
}

plugins {
  kotlin("jvm") version "1.8.20-RC" apply false
  id("com.gradle.plugin-publish") version "1.0.0" apply false
  id("com.github.gmazzo.buildconfig") version "3.1.0" apply false
}

allprojects {
  group = "my.kotlin.fir2mlir"
  version = "0.1.0-SNAPSHOT"
}

subprojects {
  repositories {
    mavenCentral()
  }
}
