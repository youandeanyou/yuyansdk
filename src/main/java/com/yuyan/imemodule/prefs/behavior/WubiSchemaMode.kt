package com.yuyan.imemodule.prefs.behavior

import com.yuyan.imemodule.view.preference.ManagedPreference

enum class WubiSchemaMode {
    WB_86,
    WB_98,
    WB_03,
    WB_TIGER,
    ;

    companion object : ManagedPreference.StringLikeCodec<WubiSchemaMode> {
        override fun decode(raw: String) = WubiSchemaMode.valueOf(raw)
    }
}