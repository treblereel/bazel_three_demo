# bazel_j2cl_demo

## how-to

* add bazel plugin to Intellij IDEA
* then import a project with File -> Import Bazel Project 

##run:
in terminal run 'bazel run //demo:client-app_dev_server'

## issues
* source map doesn't work (why do we need dev mode in this case ?)
* I have to define deps two times, one for j2cl, one for the Idea bazel plugin withing java_library, so IDE
  can recognize them as imports. That is weird, but I hope, it's just me doing something stupid.
