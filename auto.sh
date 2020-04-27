#!/usr/bin/env bash
set -e

unset http_proxy && unset https_proxy

SDK_VERSION=`cat gradle.properties | grep SDK_VERSION | sed 's/SDK_VERSION=//g'`
echo SDK_VERSION="$SDK_VERSION"

sh uploadLib.sh

git status
git add .
git status
git commit  -m "v$SDK_VERSION" --no-edit;
git tag "v$SDK_VERSION"
git log --oneline -10
git push origin
