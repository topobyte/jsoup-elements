// Copyright 2018 Sebastian Kuerten
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

import static de.topobyte.jsoup.HTML.div;
import static de.topobyte.jsoup.HTML.h1;
import static de.topobyte.jsoup.HTML.p;

import java.io.File;
import java.io.IOException;

import org.jsoup.nodes.Document;

import de.topobyte.jsoup.components.Button;
import de.topobyte.jsoup.components.Form;
import de.topobyte.jsoup.components.Input;
import de.topobyte.jsoup.components.Label;
import de.topobyte.jsoup.components.OptGroup;
import de.topobyte.jsoup.components.Option;
import de.topobyte.jsoup.components.Select;
import de.topobyte.jsoup.components.TextArea;
import de.topobyte.jsoup.nodes.Element;

public class TestForms
{

	public static void main(String[] args) throws IOException
	{
		HtmlBuilder builder = new HtmlBuilder();
		builder.getHtml().attr("lang", "de");

		Element<?> body = builder.getBody();

		body.ap(h1().inner("The headline"));

		Element<?> div = body.ap(div("foo"));

		div.ac(p().inner("This is a paragraph inside a div."));

		Form form = body.ac(HTML.form());

		Label label = form.ac(HTML.label());
		label.text("Name:");
		Input input = form.ac(HTML.input());
		input.setValue("Your name");
		input.setName("name");

		form.ac(HTML.br());

		TextArea ta = form.ac(HTML.textarea());
		ta.setName("message");
		ta.text("Your message");

		form.ac(HTML.br());

		Select select = form.ac(HTML.select());
		select.setName("option");
		Option option1 = select.ac(HTML.option());
		Option option2 = select.ac(HTML.option());

		OptGroup group = select.ac(HTML.optGroup());
		group.setLabel("more");

		Option option3 = group.ac(HTML.option());
		Option option4 = group.ac(HTML.option());

		option1.setValue("option1");
		option2.setValue("option2");
		option3.setValue("option3");
		option4.setValue("option4");
		option1.text("option1");
		option2.text("option2");
		option3.text("option3");
		option4.text("option4");

		form.ac(HTML.br());

		Button button = form.ac(HTML.button());
		button.text("Send");

		Document doc = builder.getDocument();
		System.out.println(doc);

		builder.write(new File("/tmp/jsoup-elements-forms.html"));
	}

}
