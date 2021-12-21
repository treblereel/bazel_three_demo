load("@rules_java//java:defs.bzl", "java_library")
load("@com_google_j2cl//build_defs:rules.bzl", "j2cl_application", "j2cl_library")


java_library(
    name = "demo",
    srcs = glob(
        [
           "java/src/**/*.java",
        ],
    ),
    deps = [
	    "@elemental2-dom//jar",
	    "@jsinterop-annotations//jar",
    ],
)

j2cl_library(
    name = "client-lib-j2cl",
    srcs = glob(
        [
            "java/src/**/*.java",
            "java/src/**/*.js",
        ],
    ),
    deps = [
	"@com_google_elemental2//:elemental2-dom-j2cl",
    ],
)

j2cl_application(
    name = "client-app",
    entry_points = ["library.Greeting"],
    deps = [":client-lib-j2cl"],
)