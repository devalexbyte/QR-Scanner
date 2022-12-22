package com.devalexbyte.qrscanner
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
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devalexbyte.qrscanner.databinding.ActivityMainBinding
import com.devalexbyte.qrscanner.helpers.AppConstants
import com.devalexbyte.qrscanner.helpers.PreferenceUtil

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize file config.
        PreferenceUtil.init(this, AppConstants.FILE_NAME_SETTINGS, Context.MODE_PRIVATE)
    }
}