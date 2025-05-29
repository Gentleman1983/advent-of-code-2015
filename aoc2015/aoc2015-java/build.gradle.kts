dependencies {
    api(project(":aoc-utils"))

    implementation(aoc2015Libs.commons.codec)
    implementation(aoc2015Libs.commons.lang3)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Implementation-Title"] = project.name
        attributes["Implementation-Version"] = project.version
    }
}
