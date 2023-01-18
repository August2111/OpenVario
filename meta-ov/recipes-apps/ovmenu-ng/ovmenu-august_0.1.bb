# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "OVMenu Next-Generation"
HOMEPAGE = "www.openvario.org"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=c79ff39f19dfec6d293b95dea7b07891"
SECTION = "base/app"

S = "${WORKDIR}"
PR = "r15"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = " \
	bash \
	dialog \
	ovmenu-ng-skripts \
        ovmenu-ng-autostart \
"

SRC_URI =      "\
	file://ovmenu-august.sh \
	file://machine.conf \
	file://openvario.rc \
"


addtask do_package_write_ipk after do_package

do_compile() {
        :
}

do_install() {
        echo "Installing ..."
        install -d ${D}/opt/bin ${D}/opt/conf
        install -m 0755 ${S}/ovmenu-august.sh ${D}/opt/bin/ovmenu-ng.sh
        install -m 0755 ${S}/machine.conf ${D}/opt/conf/
	install -d ${D}${ROOT_HOME}
	install -m 0755 ${S}/openvario.rc ${D}${ROOT_HOME}/.dialogrc
}

FILES:${PN} = "/opt/bin/ovmenu-ng.sh \
	/opt/conf/machine.conf \
	${ROOT_HOME}/.dialogrc \
"
