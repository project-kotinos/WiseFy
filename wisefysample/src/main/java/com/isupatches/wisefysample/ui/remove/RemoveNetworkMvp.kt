/*
 * Copyright 2019 Patches Klinefelter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.isupatches.wisefysample.ui.remove

import android.Manifest.permission.ACCESS_FINE_LOCATION
import androidx.annotation.RequiresPermission
import com.isupatches.wisefy.callbacks.RemoveNetworkCallbacks
import com.isupatches.wisefysample.internal.base.BaseMvp

@Suppress("UndocumentedPublicClass", "UndocumentedPublicFunction")
internal interface RemoveNetworkMvp {

    interface View : BaseMvp.View {
        fun displayNetworkRemoved()
        fun displayNetworkNotFoundToRemove()
        fun displayFailureRemovingNetwork()
    }

    interface Presenter : BaseMvp.Presenter<View> {

        @RequiresPermission(ACCESS_FINE_LOCATION)
        fun removeNetwork(networkName: String)
    }

    interface Model {

        @RequiresPermission(ACCESS_FINE_LOCATION)
        fun removeNetwork(networkName: String, callbacks: RemoveNetworkCallbacks)
    }
}
