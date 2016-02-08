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

package de.topobyte.jsoup;

import de.topobyte.jsoup.components.Div;
import de.topobyte.jsoup.components.Headline;
import de.topobyte.jsoup.components.Headline.Level;
import de.topobyte.jsoup.components.ListItem;
import de.topobyte.jsoup.components.OrderedList;
import de.topobyte.jsoup.components.P;
import de.topobyte.jsoup.components.Pre;
import de.topobyte.jsoup.components.Table;
import de.topobyte.jsoup.components.TableBody;
import de.topobyte.jsoup.components.TableCell;
import de.topobyte.jsoup.components.TableHead;
import de.topobyte.jsoup.components.TableHeader;
import de.topobyte.jsoup.components.TableRow;
import de.topobyte.jsoup.components.UnorderedList;

public class HTML
{

	public static Div div()
	{
		return new Div();
	}

	public static Div div(String clazz)
	{
		return new Div(clazz);
	}

	public static P p()
	{
		return new P();
	}

	public static Headline h1()
	{
		return new Headline(Level.H1);
	}

	public static Headline h2()
	{
		return new Headline(Level.H2);
	}

	public static Headline h3()
	{
		return new Headline(Level.H3);
	}

	public static Headline h4()
	{
		return new Headline(Level.H4);
	}

	public static Headline h5()
	{
		return new Headline(Level.H5);
	}

	public static Headline h6()
	{
		return new Headline(Level.H6);
	}

	public static UnorderedList ul()
	{
		return new UnorderedList();
	}

	public static OrderedList ol()
	{
		return new OrderedList();
	}

	public static ListItem li()
	{
		return new ListItem();
	}

	public static Pre pre()
	{
		return new Pre();
	}

	public static Table table()
	{
		return new Table();
	}

	public static TableHead thead()
	{
		return new TableHead();
	}

	public static TableBody tbody()
	{
		return new TableBody();
	}

	public static TableRow tr()
	{
		return new TableRow();
	}

	public static TableHeader th()
	{
		return new TableHeader();
	}

	public static TableCell td()
	{
		return new TableCell();
	}

}
