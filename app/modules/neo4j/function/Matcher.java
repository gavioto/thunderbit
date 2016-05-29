/*
 * Copyright (C) 2016 Thunderbit team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package modules.neo4j.function;

import modules.neo4j.domain.Tag;

import java.util.List;

public interface Matcher {
    /**
     * Matches a the tags with its children and returns a list with the names
     */
    List<String> matchTagsString(String... tagsName);

    /**
     * Matches a the tags with its children and returns a list with the tags
     */
    Iterable<Tag> matchTags(String... tagsName);
}
