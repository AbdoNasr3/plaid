/*
 * Copyright 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.plaidapp.core.dribbble.data.search

import io.plaidapp.core.dribbble.data.api.model.Shot
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Search Dribbble by scraping website
 */
interface DribbbleSearchService {

    @GET("search")
    fun searchDeferred(
        @Query("q") query: String,
        @Query("page") page: Int?,
        @Query("s") sort: String,
        @Query("per_page") pageSize: Int
    ): Deferred<Response<List<Shot>>>

    companion object {

        const val ENDPOINT = "https://dribbble.com/"
        const val PER_PAGE_DEFAULT = 12
    }
}
