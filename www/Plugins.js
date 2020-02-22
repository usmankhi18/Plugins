var exec = require('cordova/exec');

module.exports.activity = function (arg0, success, error) {
    exec(success, error, 'Plugins', 'activity', [arg0]);
};

module.exports.camera = function (arg0, success, error) {
    exec(success, error, 'Plugins', 'camera', [arg0]);
};
