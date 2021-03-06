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

public class TableRow extends Element<TableRow>
{

	public TableRow()
	{
		super("tr");
	}

	public TableRow(String clazz)
	{
		this();
		attr("class", clazz);
	}

	public TableHeader header()
	{
		TableHeader cell = new TableHeader();
		appendChild(cell);
		return cell;
	}

	public TableHeader header(String content)
	{
		TableHeader cell = new TableHeader(content);
		appendChild(cell);
		return cell;
	}

	public TableHeader header(Node child)
	{
		TableHeader cell = new TableHeader(child);
		appendChild(cell);
		return cell;
	}

	public TableCell cell()
	{
		TableCell cell = new TableCell();
		appendChild(cell);
		return cell;
	}

	public TableCell cell(String content)
	{
		TableCell cell = new TableCell(content);
		appendChild(cell);
		return cell;
	}

	public TableCell cell(Node child)
	{
		TableCell cell = new TableCell(child);
		appendChild(cell);
		return cell;
	}

}
