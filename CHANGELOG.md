Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).


## [1.0.27] - 2025-09-07

### Build & Publishing
- Stabilize Maven publish pipeline; configure publications after evaluation and fall back to AAR when needed.
- Fix Javadoc during publish by adding Android boot + release compile classpaths and disabling strict doclint.
- Parameterize AGP/SDK versions; allow `-P` overrides for CI/local builds.
- Ensure JitPack installs Android SDK platform 35 and build-tools 35.0.0 before building.
- Align Gradle/AGP, Java 17 test flags, and JaCoCo; upgrade Gradle wrapper.

### Dependencies & Android
- Migrate to AndroidX/Material components and use namespace over manifest package where applicable.
- Replace JetBrains `Nullable` with AndroidX `Nullable`; remove conflicting annotations.
- Update image Compressor usage to current API.

### Refactors
- Widen `FpJsonFormUtils.locationId` to `protected`.
- Adapt form API/metadata and decouple from JsonWizard `Form` where applicable.

### Tests
- Avoid Activity instantiation in tests to prevent NPEs; update test configuration.

### Notes
- No API-breaking changes; patch release.
- Tag: `v1.0.27`.

