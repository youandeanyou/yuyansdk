package com.yuyan.imemodule.prefs.behavior

import com.yuyan.imemodule.view.preference.ManagedPreference

enum class WubiSchemaMode {
    wb86,
    wb98,
    xinshiji,
    tiger,
    ;

    companion object : ManagedPreference.StringLikeCodec<WubiSchemaMode> {
        override fun decode(raw: String) = WubiSchemaMode.valueOf(raw)
    }
}