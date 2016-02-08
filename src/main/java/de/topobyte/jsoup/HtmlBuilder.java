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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;

import de.topobyte.jsoup.components.Body;
import de.topobyte.jsoup.components.Head;
import de.topobyte.jsoup.components.Html;
import de.topobyte.jsoup.components.Title;
import de.topobyte.jsoup.nodes.Element;

public class HtmlBuilder
{

	private Document document;
	private Element head;
	private Element body;
	private Element title;

	public HtmlBuilder()
	{
		document = new Document("");

		OutputSettings settings = document.outputSettings();
		settings.charset("UTF-8");
		settings.indentAmount(2);
		settings.prettyPrint(true);
		document.outputSettings(settings);

		Element html = new Html();
		document.appendChild(html);

		head = html.app(new Head());
		title = head.app(new Title());

		body = html.app(new Body());
	}

	public Document getDocument()
	{
		return document;
	}

	public Element getHead()
	{
		return head;
	}

	public Element getTitle()
	{
		return title;
	}

	public Element getBody()
	{
		return body;
	}

	public void write(File file) throws IOException
	{
		String text = document.toString();
		OutputStream os = new FileOutputStream(file);
		os.write(text.getBytes(Charset.forName("UTF-8")));
		os.close();
	}

}
