plugins {
    id("com.gradle.develocity") version("4.0.2")
}

rootProject.name = "advent-of-code-2015"

include("aoc2015")
include("aoc2015:aoc2015-java")
include("aoc2015:aoc2015-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
