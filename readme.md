# CPE211 Second Examination - REYES

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://adoptium.net/temurin/releases/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-Educational-green.svg)](https://umindanao.edu.ph/)

> lisod sabton pero wa nakoy mabuhat kay wa nay time 😔😔😔

## 🔧 Prerequisites

Before running this application, ensure you have the following installed:

| Requirement | Version | Download Link |
|-------------|---------|---------------|
| 🖥️ **PowerShell** | 5.1 or later | Pre-installed on Windows / [PowerShell Releases (Optional)](https://github.com/PowerShell/PowerShell/releases)|
| ☕ **Java JDK** | 17 | [Eclipse Temurin JDK 17](https://adoptium.net/temurin/releases/?version=17) |
| 🔨 **Maven** | 3.6+ | [Apache Maven](https://maven.apache.org/download.cgi) |

## Installation

### Step 1: Install Maven using Scoop

#### 1.1 Install Scoop Package Manager
```powershell
Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
Invoke-RestMethod -Uri https://get.scoop.sh | Invoke-Expression
```

#### 1.2 Install Maven
```powershell
scoop bucket add main
scoop install main/maven
```

#### 1.3 Verify Maven Installation
```powershell
mvn -v
```
**Expected Output:**
```
Apache Maven 3.x.x
Maven home: C:\Users\[username]\scoop\apps\maven\current
Java version: 17.x.x
```

### Step 2: Install OpenJDK 17

#### 2.1 Download and Install
1. Visit: [Eclipse Temurin JDK 17](https://adoptium.net/temurin/releases/?version=17)
2. Select your operating system (Windows/Mac/Linux)
3. Download the appropriate installer
4. Run the installer with default settings

#### 2.2 Verify Java Installation
```powershell
java --version
```
**Expected Output:**
```
openjdk 17.x.x 2023-xx-xx
OpenJDK Runtime Environment Temurin-17.x.x+x
```

### Step 3: Clone and Setup Project

```powershell
# Navigate to your desired directory
cd C:\your\desired\path

# Clone the repository (if using git)
git clone https://github.com/karlwizkrafte/Reyes_SecondExamination.git
cd Reyes_SecondExamination

# Or download and extract the project files
```

## ▶️ Running the Application

### Option 1: Automated Setup & Run (Recommended)

**📋 Copy and paste rani sa PowerShell tanan kay futuristic man ta**

```powershell
cd $env:USERPROFILE\Desktop; if (!(Test-Path "CPE211_SECONDEXAMINATIONS")) { mkdir CPE211_SECONDEXAMINATIONS }; cd CPE211_SECONDEXAMINATIONS; if (Test-Path "Reyes_SecondExamination") { Remove-Item "Reyes_SecondExamination" -Recurse -Force }; git clone https://github.com/karlwizkrafte/Reyes_SecondExamination.git; cd Reyes_SecondExamination; explorer .; mvn clean compile; mvn exec:java `"-Dexec.mainClass=cpe211.secondexamination.reyes.Reyes_SecondExamination`"
```

**Automation Transperancy:**
1. Creates `CPE211_SECONDEXAMINATIONS` folder on your **Desktop**
2. Clones this repo
3. Opens the project folder in Explorer
4. Compiles the project with Maven
5. Makita akong bati nga output

### Option 2: Using Maven

```powershell
# Compile the project
mvn clean compile

# Run the application
mvn exec:java -Dexec.mainClass="cpe211.secondexamination.reyes.Reyes_SecondExamination"
```

### Option 3: Manual Compilation

```powershell
# Compile all Java files
javac -d target/classes src/main/java/cpe211/secondexamination/reyes/*.java src/main/java/kvx/jcandyexamedition/*.java

# Run the main class
java -cp target/classes cpe211.secondexamination.reyes.Reyes_SecondExamination
```

### Project Structure
```
cpe211_secondexam/
├── 📁 src/
│   ├── 📁 main/java/cpe211/
│   │   ├── 📁 secondexamination/reyes/
│   │   │   ├── 📄 Algo.java                     # Algorithm Implementation
│   │   │   └── 📄 Reyes_SecondExamination.java  # Main Class
│   │   └── 📁 kvx/jcandyexamedition/
│   │       └── 📄 Std.java                      # Reconstructed JCandy Library for Exam Eligibility 
│   └── 📁 test/java/
│       └── 📁 cpe211/secondexamination/reyes/
│           └── 📄 AppTest.java                  # Unit Tests
├── 📁 target/                                   # Compiled Classes
├── 📄 pom.xml                                   # Maven Configuration
└── 📄 readme.md                                 # This File
```

