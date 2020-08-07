LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE     := config_so
LOCAL_SRC_FILES  := config_so.c
LOCAL_C_INCLUDES := $(LOCAL_PATH)
#LOCAL_CFLAGS     := -Wall -Wextra -Werror -fvisibility=hidden
LOCAL_CONLYFLAGS := -std=c11
LOCAL_LDLIBS     := -llog
# -Wno-unused- 加上对应的变量或参数类型，即可忽略当前警告，编译通过。
LOCAL_CFLAGS += -Wno-unused-const-variable -Wno-unused-variable -Wno-unused-parameter
include $(BUILD_SHARED_LIBRARY)
