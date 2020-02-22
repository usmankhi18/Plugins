<p align="center">
  <img width="200" height="200" src="https://github.com/usmankhi18/PluginsApp/blob/master/resources/icon.png">
</p>
1. Install Node JS
    https://nodejs.org/en/


2. npm install -g plugman

3. Create Plugin
    plugman create --name <pluginName> --plugin_id <pluginID> --plugin_version <version> [--path <directory>] [--variable NAME=VALUE]
    plugman create --name Plugins --plugin_id cordova-plugin-plugins --plugin_version 1.0.0

4. Go Inside Directory / add platforms

5. In plugin.xml , correct the path for "target-dir"

7. In plugin.xml,  correct the  android-package by replacing "-" with "."

6. in Plugins.java in src. correct the package name by replacing "-" with "."

7. in Plugins.js, add different methods you wants your plugin to perform.

8. add defination of all these methods in "Plugins.java" for android and in "Plugins.m" for ios. 

9. make "clobbers" as as single string like "Plugins" or it will not work.
