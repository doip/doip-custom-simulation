#!/bin/bash

java -Dlog4j.configurationFile="log4j2.xml" -jar libs/doip-custom-simulation-2.0.0.jar "$@"
