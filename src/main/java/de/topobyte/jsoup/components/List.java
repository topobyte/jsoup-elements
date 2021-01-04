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

import org.jsoup.nodes.Node;

import de.topobyte.jsoup.nodes.Element;

public class List extends Element<List>
{

	public List(boolean ordered)
	{
		super(ordered ? "ol" : "ul");
	}

	public ListItem addItem()
	{
		return ac(new ListItem());
	}

	public ListItem addTextItem(String text)
	{
		ListItem listItem = addItem();
		listItem.appendText(text);
		return listItem;
	}

	public ListItem addItem(Node e)
	{
		ListItem listItem = addItem();
		listItem.ap(e);
		return listItem;
	}

}
