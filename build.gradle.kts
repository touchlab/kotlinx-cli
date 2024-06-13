buildscript {
    repositories {
        mavenCentral()
    }
    val kotlinVersion: String by project
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

plugins {
    alias(libs.plugins.maven.publish) apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}