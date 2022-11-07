# android-extra-large-benchmark
A very large Android benchmark project, used for profiling build and sync performance. The project is intentially very large in order
to make detecting performance issues easier. The project has been generated using [project-replicator](https://github.com/android/project-replicator),
with a real-world project blueprint file.

# Using the benchmark
Please clone a version-specific branch of the project. E.g. `git clone --branch 2022.9 https://github.com/gavra0/android-extra-large-benchmark.git`. More versions of the project will be added in the future,
and each will follow the same versioning patter `YEAR.MONTH`. To see all available versions run `git branch -r`

# Adding a new version of the benchmark
Use the [project-replicator](https://github.com/android/project-replicator) to generate a new copy of the project.
Follow the steps below:
```
git checkout -b <YEAR.MONTH> && git reset --hard origin/main
# generate the project using project-replicator
git add * # add all our your changes
git commit -m "New version of the project"
git push origin HEAD
```

# Running tasks
The main application is `:module03:module09:module1`, and in order to benchmark it please run
```
./gradlew :module03:module09:module1:assembleDebug
```

You can also execute `./gradlew assembleDebug` that will assemble all projects, but please keep in mind this will take a while to run.