# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

PR="r23.7"
# RCONFLICTS:${PN}="opensoar-dev"

require openvario.inc

# SRC_URI = "git://github.com/OpenSoaring/OpenSoar.git;protocol=https;branch=master " 
# OpenSoar Tag: v7.43-3.24
# SRCREV = "${AUTOREV}"

# v7.43-3.23.7l:
SRC_URI = "git://github.com/August2111/OpenSoar.git;protocol=https;branch=dev-branch " 
SRCREV = "02f81fc1af827a6f993b7af12e9f471e69ddee95"

# dev branch is: boost 1.87:
BOOST_VERSION = "1.87.0"
BOOST_SHA256HASH = "af57be25cb4c4f4b413ed692fe378affb4352ea50fbe294a11ef548f4d527d89"

require opensoar.inc

