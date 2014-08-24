/**
 * This file is part of FoxelLog.
 *
 * FoxelLog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FoxelLog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FoxelLog.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.foxelbox.foxellog.actions;

import org.bukkit.entity.HumanEntity;
import org.elasticsearch.common.xcontent.XContentBuilder;

import java.io.IOException;

public class PlayerChatAction extends PlayerAction {
	private final String message;

	public PlayerChatAction(HumanEntity user, String message) {
		super(user, "chat");
		this.message = message;
	}

	@Override
    public XContentBuilder toJSONObject(XContentBuilder builder) throws IOException {
        builder = super.toJSONObject(builder);

		builder.field("message", message);

		return builder;
	}
}