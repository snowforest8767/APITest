#!/bin/bash

set -ex
# goto current directory
CUR_DIR=`dirname "$0"`
cd "$CUR_DIR"
# install Helper project
cd Helper
mvn clean install -Dmaven.test.skip=true
# generate TestProject
mvn api:genTests -U
mvn clean install -Dmaven.test.skip=true
