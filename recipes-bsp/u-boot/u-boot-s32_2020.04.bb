require recipes-bsp/u-boot/u-boot-nxp.inc
require recipes-bsp/u-boot/u-boot-src-${PV}.inc

LIC_FILES_CHKSUM += " \
    file://Licenses/lgpl-2.0.txt;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
"

# Support for generating default environment
SRC_URI += " \
    file://0001-env-Add-Makefile-rule-to-generate-default-environment-${PV}.patch \
"
