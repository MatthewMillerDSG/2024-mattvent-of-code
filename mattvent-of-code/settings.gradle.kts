pluginManagement {
    plugins {
        kotlin("jvm") version "2.1.0"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "mattvent-of-code"

include(":day1")
include(":day2")
include(":day3")
include(":day4")
include(":day5")
include(":day6")
include(":day7")
include(":day8")
include(":day9")
include(":day10")
include(":day11")
include(":day12")
include(":day13")
include(":day14")
include(":day15")
include(":day16")
include(":day17")
include(":day18")
include(":day19")
include(":day20")
include(":day21")
include(":day22")
include(":day23")
include(":day24")
include(":day25")
include("day1")
include("day1:day2")
findProject(":day1:day2")?.name = "day2"
include("day2")
