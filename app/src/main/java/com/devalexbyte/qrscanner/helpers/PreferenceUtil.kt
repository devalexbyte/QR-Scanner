package com.devalexbyte.qrscanner.helpers
/*
 * Copyright (C) 2022-2022 DEVALEXBYTE <https://github.com/devalexbyte/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

import android.content.Context
import android.content.SharedPreferences

object PreferenceUtil
{
    private lateinit var shared: SharedPreferences

    fun init(context: Context, config: String, mode: Int)
    {
        shared = context.getSharedPreferences(config, mode)!!
    }

    fun getBoolean(key: String): Boolean
    {
        return shared.getBoolean(key, false)
    }

    fun setBoolean(key: String, value: Boolean)
    {
        val editor: SharedPreferences.Editor? = shared.edit()
        editor?.putBoolean(key, value)
        editor?.apply()
    }
}