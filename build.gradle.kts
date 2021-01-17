import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    java
}

group = "me.sergey"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    api("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.0.1")
    api("org.apache.pdfbox:pdfbox:2.0.22")
    implementation("org.junit.jupiter:junit-jupiter:5.4.2")

    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

val fatJar = task("fatJar", type = Jar::class) {
    manifest {
        attributes(
                "Main-Class" to "telegram.printer.bot.BotKt"
        )
    }
    from(sourceSets.main.get().output)
    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}


tasks {
    "build" {
        dependsOn(fatJar)
    }
}
