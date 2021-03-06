package com.dm.material.dashboard.candybar.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/*
 * CandyBar - Material Dashboard
 *
 * Copyright (c) 2014-2016 Dani Mahardhika
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class JsonStructure {

    private Builder mBuilder;

    private JsonStructure(@NonNull Builder builder) {
        mBuilder = builder;
    }

    @Nullable
    public String arrayName() {
        return mBuilder.mArrayName;
    }

    @Nullable
    public String name() {
        return mBuilder.mName;
    }

    public String author() {
        return mBuilder.mAuthor;
    }

    public String url() {
        return mBuilder.mUrl;
    }

    @Nullable
    public String thumbUrl() {
        return mBuilder.mThumbUrl;
    }

    public static class Builder {

        private final String mArrayName;
        private String mName = "name";
        private String mAuthor = "author";
        private String mUrl = "url";
        private String mThumbUrl = "thumbUrl";

        public Builder(@Nullable String arrayName) {
            mArrayName = arrayName;
        }

        public Builder name(@Nullable String name) {
            mName = name;
            return this;
        }

        public Builder author(@NonNull String author) {
            mAuthor = author;
            return this;
        }

        public Builder url(@NonNull String url) {
            mUrl = url;
            return this;
        }

        public Builder thumbUrl(@Nullable String thumbUrl) {
            mThumbUrl = thumbUrl;
            return this;
        }

        public JsonStructure build() {
            return new JsonStructure(this);
        }
    }
}
