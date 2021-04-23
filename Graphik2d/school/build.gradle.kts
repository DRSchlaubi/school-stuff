plugins {
    java
    application
}

group = "de.mik"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClassName = "CoffeeMachine"
}
tasks {
    "run"(JavaExec::class) {
        jvmArgs = mutableListOf("-Dfile.encoding=utf-8")
        standardInput = System.`in`
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("org.jetbrains", "annotations", "20.1.0")
}