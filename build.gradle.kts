buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:7.1.3")

        classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.20")
        classpath("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")
        classpath("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
        classpath("io.ktor:ktor-client-core:1.6.3")
        classpath("io.ktor:ktor-client-logging:1.6.3")
        classpath("io.ktor:ktor-client-serialization:1.6.3")
        classpath("org.kodein.di:kodein-di:7.0.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}