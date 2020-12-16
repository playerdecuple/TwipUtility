// Twipe : Made by PatrickKR

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import groovy.lang.MissingPropertyException
import org.gradle.jvm.tasks.Jar
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.net.URL

plugins {
    java
    kotlin("jvm") version "1.4.0"
    `maven-publish`
    signing
    id("com.github.johnrengelman.shadow") version "6.1.0"
    id("org.jetbrains.dokka") version "1.4.10"
}

group = "com.DeveloperDecuple"
version = "1.0.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
    implementation("com.neovisionaries:nv-websocket-client:2.10")
    implementation("com.google.code.gson:gson:2.8.6")
}
