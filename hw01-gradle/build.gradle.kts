import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("com.github.johnrengelman.shadow")
}

dependencies {
    implementation("com.google.guava:guava")
}

tasks.withType<ShadowJar> {
    archiveBaseName = "hw01-gradle"
    archiveVersion = "0.1"
    archiveClassifier = ""
    manifest {
        attributes(mapOf(
            "Main-Class" to "com.alexstrive.HelloOtus"
        ))
    }
}

tasks.named("build") {
    dependsOn("shadowJar")
}