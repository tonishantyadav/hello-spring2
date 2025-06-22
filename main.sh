#!/bin/bash

# Navigate into the 'demo' project directory
cd "$(dirname "$0")/demo"

# Clean, compile and run Main.java using Maven
mvn clean compile exec:java -Dexec.mainClass="com.example.Main"
