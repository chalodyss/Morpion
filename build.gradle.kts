/* Copyright (c) 2024, Charles T. */

group   = "abitodyssey.morpion"
version = "1.0.0"

plugins {
    application
    id("org.javamodularity.moduleplugin") version "1.8.15"
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("org.beryx.jlink") version "3.0.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.morpion.Main"
    mainModule  = "morpion"
}

javafx {
    modules("javafx.graphics", "javafx.controls", "javafx.fxml")
}

sourceSets {
    main {
        resources.srcDir("src/main/resources/images/")
    }
}

tasks.withType<Jar> {
    archiveBaseName = "Morpion"

    manifest {
        attributes["Main-Class"] = "abitodyssey.morpion.Main"
    }
}

jlink {
    options = listOf("--strip-debug", "--no-header-files", "--no-man-pages", "--bind-services")

    launcher {
        name = "morpion"
    }
}
