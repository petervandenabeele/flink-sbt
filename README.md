# flink-sbt: Simple Apache Flink program in sbt directory structure

This is an extremely minimal program (only 2 "real" files) that runs
an [Apache Flink](https://flink.apache.org/) 0.10.0 program with a
Scala WordCount example.

* the `build.sbt` file makes sure the Apache Flink libraries are pulled
* the `src/main/scala/WordCount.scala` runs the minimal WordCount example

## Installation and Running

* The minimal command is:

```
$ brew install sbt # unless already installed, minimal version 0.13.8
$ git clone https://github.com/petervandenabeele/flink-sbt.git
$ cd flink-sbt
$ sbt run
...
[info] 11/21/2015 21:24:11	Job execution switched to status FINISHED.
[info] (not,1)
[info] (be,2)
[info] (the,1)
[info] (to,2)
[info] (is,1)
[info] (or,1)
[info] (question,1)
[info] (that,1)
[success] Total time: 4 s, completed Nov 21, 2015 9:24:12 PM
```
