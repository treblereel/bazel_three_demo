workspace(name = "bazel_demo_project")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "com_google_j2cl",
    strip_prefix = "j2cl-master",
    url = "https://github.com/google/j2cl/archive/master.zip",
)

load("@com_google_j2cl//build_defs:repository.bzl", "load_j2cl_repo_deps")
load_j2cl_repo_deps()

load("@com_google_j2cl//build_defs:rules.bzl", "setup_j2cl_workspace", "j2cl_maven_import_external")
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

_MAVEN_CENTRAL_URLS = ["https://repo1.maven.org/maven2/"]

j2cl_maven_import_external(
    name = "j2cl-processors-annotations",
    artifact = "org.treblereel.j2cl.processors:annotations:0.3",
    server_urls = _MAVEN_CENTRAL_URLS,
)

load("@bazel_tools//tools/build_defs/repo:maven_rules.bzl", "maven_jar")

maven_jar(
    name = "gwt3-processors",
    artifact = "org.treblereel.j2cl.processors:processors:0.3",
)
