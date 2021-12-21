load("@bazel_tools//tools/build_defs/repo:jvm.bzl", "jvm_maven_import_external")

def maven_dependencies(
        maven_servers = ["https://repo1.maven.org/maven2/"]):

    jvm_maven_import_external(
        name = "junit",
        artifact = "junit:junit:4.13",
        artifact_sha256 = "4b8532f63bdc0e0661507f947eb324a954d1dbac631ad19c8aa9a00feed1d863",
        licenses = ["notice"],
        server_urls = maven_servers,
    )

    jvm_maven_import_external(
       name = "jsinterop-base",
       artifact = "com.google.jsinterop:base:1.0.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )

    jvm_maven_import_external(
       name = "jsinterop-annotations",
       artifact = "com.google.jsinterop:jsinterop-annotations:2.0.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )

    jvm_maven_import_external(
       name = "elemental2-dom",
       artifact = "com.google.elemental2:elemental2-dom:1.1.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )
    jvm_maven_import_external(
       name = "elemental2-core",
       artifact = "com.google.elemental2:elemental2-core:1.1.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )
    jvm_maven_import_external(
       name = "elemental2-promise",
       artifact = "com.google.elemental2:elemental2-promise:1.1.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )
    jvm_maven_import_external(
       name = "jsinterop-base",
       artifact = "com.google.jsinterop:base:1.0.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )
    jvm_maven_import_external(
       name = "jsinterop-annotations",
       artifact = "com.google.jsinterop:jsinterop-annotations:2.0.0",
       licenses = ["notice"],
       server_urls = maven_servers,
    )
    jvm_maven_import_external(
       name = "gwt3-processors-annotations",
       artifact = "org.treblereel.j2cl.processors:annotations:0.3",
       licenses = ["notice"],
       server_urls = maven_servers,
    )
