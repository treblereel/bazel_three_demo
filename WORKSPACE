workspace(name = "bazel_demo_project")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "com_google_j2cl",
    strip_prefix = "j2cl-master",
    url = "https://github.com/google/j2cl/archive/master.zip",
)

load("@com_google_j2cl//build_defs:repository.bzl", "load_j2cl_repo_deps")
load_j2cl_repo_deps()

load("@com_google_j2cl//build_defs:rules.bzl", "setup_j2cl_workspace")
setup_j2cl_workspace()

http_archive(
    name = "com_google_elemental2",
    strip_prefix = "elemental2-1.1.0",
    url = "https://github.com/google/elemental2/archive/1.1.0.zip",
)

load("@com_google_elemental2//build_defs:repository.bzl", "load_elemental2_repo_deps")
load_elemental2_repo_deps()

load("@com_google_elemental2//build_defs:workspace.bzl", "setup_elemental2_workspace")
setup_elemental2_workspace()

# Maven dependencies
load("//third_party/maven:dependencies.bzl", "maven_dependencies")
maven_dependencies()
