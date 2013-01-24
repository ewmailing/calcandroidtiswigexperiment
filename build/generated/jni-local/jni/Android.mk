# Copyright (C) 2009 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_CFLAGS := "-I$(TI_MOBILE_SDK)/android/native/include" -I$(SYSROOT)/usr/include "-I/Users/ewing/Library/Application Support/Titanium/mobilesdk/osx/3.0.0.GA/android/native/include"
#LOCAL_CFLAGS += -Wno-conversion-null

# cf https://groups.google.com/forum/?fromgroups=#!topic/android-ndk/Q8ajOD37LR0
#LOCAL_CFLAGS += -Wno-psabi

LOCAL_MODULE    := hello-jni
#LOCAL_SRC_FILES := hello-jni.c example.c example_wrap_javascript_v8.cpp
LOCAL_SRC_FILES := hello-jni.c 
#LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -ldl -llog -L$(TARGET_OUT) "-L/Users/ewing/Library/Application Support/Titanium/mobilesdk/osx/3.0.0.GA/android/native/libs/$(TARGET_ARCH_ABI)" -lkroll-v8
LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -L$(TARGET_OUT) "-L$(TI_MOBILE_SDK)/android/native/libs/$(TARGET_ARCH_ABI)" -lkroll-v8

include $(BUILD_SHARED_LIBRARY)
