# I
AGP_VERSION_I=8.3.0-alpha06
KGP_VERSION_I=1.9.10
GRADLE_VERSION_I=8.3-rc-2

# H
AGP_VERSION_H=8.2.0-beta06
KGP_VERSION_H=1.9.10
GRADLE_VERSION_H=8.2

# G
AGP_VERSION_G=8.1.1
KGP_VERSION_G=1.9.0
GRADLE_VERSION_G=8.0

# F
KGP_VERSION_F=1.8.20
AGP_VERSION_F=8.0.2
GRADLE_VERSION_F=8.0

# E
KGP_VERSION_E=1.8.0
AGP_VERSION_E=7.4.2
GRADLE_VERSION_E=7.5

# D
KGP_VERSION_D=1.7.20
AGP_VERSION_D=7.3.1
GRADLE_VERSION_D=7.4

# C
KGP_VERSION_C=1.6.10
AGP_VERSION_C=7.2.2
GRADLE_VERSION_C=7.3.3

# B
KGP_VERSION_B=1.5.30
AGP_VERSION_B=7.1.3
GRADLE_VERSION_B=7.2

# A
KGP_VERSION_A=1.5.20
AGP_VERSION_A=7.0.4
GRADLE_VERSION_A=7.0.2

# Values to update to
KGP_VERSION=$KGP_VERSION_G
AGP_VERSION=$AGP_VERSION_G
GRADLE_VERSION=$GRADLE_VERSION_G

# Set AGP version
sed -i -E "/id 'com.android.(.*)'/s/version '[^']*'/version '$AGP_VERSION'/" build.gradle
# Set KGP version
sed -i -E "/id 'org.jetbrains.kotlin.(.*)'/s/version '[^']*'/version '$KGP_VERSION'/" build.gradle
# Set Gradle version
sed -i -E "s/gradle-(.*)-bin.zip/gradle-$GRADLE_VERSION-bin.zip/" gradle/wrapper/gradle-wrapper.properties

