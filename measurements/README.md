This is where the measurements taken by `androidStudioSyncWithMeasurement` scenario in `profiler-scenarios/sync.scenario` will end up. 
The directory needs to exist for it to work properly, which is why this readme file exists.

You can run the scenario via the following command from the main project directory:
`gradle-profiler --scenario-file profiler-scenarios/sync.scenario androidStudioSyncWithMeasurement --benchmark --studio-install-dir=<studio-dir>`