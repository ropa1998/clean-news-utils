import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import implementations.core.article.Article;
import implementations.core.article.IArticle;
import implementations.core.medium.IMedium;
import implementations.core.medium.Medium;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<IArticle> articleList = new ArrayList<>();
        articleList.add(getDummyArticle());
        articleList.add(getDummyArticle());
        Writer writer = new FileWriter("yourfile.csv");
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        beanToCsv.write(articleList);
        writer.close();
    }

    private static IArticle getDummyArticle() {
        String title = "Lorem Ipsum";
        String body = "Lorem ipsum dolor sit amet consectetur adipiscing elit massa, nisi tincidunt cubilia maecenas condimentum tempus tellus commodo euismod, neque cras sollicitudin mollis blandit egestas cursus. Metus senectus commodo purus placerat natoque aliquam quisque vestibulum, nisl laoreet praesent class integer rhoncus dapibus. Lobortis euismod nibh tempus elementum phasellus augue vel dui netus, nulla tristique pulvinar habitasse fames mauris pretium semper, dapibus a malesuada turpis felis tortor velit arcu.\n" +
                "\n" +
                "Nisi ultricies dis commodo in libero morbi faucibus ac ornare venenatis facilisi leo sociis, luctus volutpat integer pulvinar cras suscipit potenti class convallis suspendisse urna. Suscipit fusce curae volutpat penatibus laoreet fringilla sociis accumsan sodales ad risus, eget urna enim lacinia hac proin dignissim ut taciti. Vivamus nec dictumst vestibulum cum ultrices a, tempus mattis laoreet torquent tempor, purus rhoncus hac mollis mauris.";
        String url = "www.loremipsum.com";
        IMedium medium = new Medium("Dummy Medium", "dummyString", "DummyKey");

        return new Article(title, body, url, medium);
    }
}
