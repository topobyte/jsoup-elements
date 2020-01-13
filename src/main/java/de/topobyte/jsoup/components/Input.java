// Copyright 2016 Sebastian Kuerten
//
// This file is part of jsoup-elements.
//
// jsoup-elements is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jsoup-elements is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jsoup-elements. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.jsoup.components;

import de.topobyte.jsoup.nodes.Element;

public class Input extends Element
{

	public static enum Type {
		TEXT,
		PASSWORD,
		CHECKBOX,
		RADIO,
		SUBMIT,
		RESET,
		FILE,
		HIDDEN,
		IMAGE,
		BUTTON;

		private String value;

		private Type()
		{
			value = name().toLowerCase();
		};
	}

	public Input()
	{
		super("input");
	}

	public void setType(Type type)
	{
		attr("type", type.value);
	}

	public void setType(String type)
	{
		attr("type", type);
	}

	public void setId(String id)
	{
		attr("id", id);
	}

	public void setName(String name)
	{
		attr("name", name);
	}

	public void setValue(String value)
	{
		attr("value", value);
	}

	public void setPlaceholder(String value)
	{
		attr("placeholder", value);
	}

	/**
	 * When the type is "radio" or "checkbox", this property specifies that the
	 * control is checked.
	 * 
	 * @param value
	 *            a boolean value.
	 */
	public void setChecked(boolean value)
	{
		attr("checked", value);
	}

	public void setSize(int size)
	{
		attr("size", Integer.toString(size));
	}

	public void maxLength(int maxLength)
	{
		attr("maxlength", Integer.toString(maxLength));
	}

	/**
	 * When the type is "image", this property specifies the location of the
	 * image to be displayed.
	 * 
	 * @param src
	 *            the location of an image.
	 */
	public void setSrc(String src)
	{
		attr("src", src);
	}

}
