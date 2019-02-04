

package trainingcentersystem;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public final class BarChart extends JFrame {
    static String ChartTitle="";
    
    public BarChart(String title , String []lines , int []n,String strSquare,String y_axis,String x_axis) {
        super(title);
        this.ChartTitle=title;
        final CategoryDataset dataset = CreateDataSet(lines, n,strSquare);
        final JFreeChart Chart = CreateChart(dataset,y_axis,x_axis);
        final ChartPanel chartpanel = new ChartPanel(Chart);
        chartpanel.setPreferredSize(new Dimension(900,650));
        setContentPane(chartpanel);
        try{
            saveToFile(Chart, 900, 650, 100);
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
    
    
    private CategoryDataset CreateDataSet(String []line , int []n,String series)
    {
        final String Series = series;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0 ; i<line.length ; i++)//line.length
            dataset.addValue(n[i], Series, line[i]);
        return dataset;
    }
    
    
    
    private JFreeChart CreateChart(final CategoryDataset dataset,String y_axis,String x_axis)
    {
        final JFreeChart Chart = ChartFactory.createBarChart3D(ChartTitle, x_axis, y_axis, dataset, PlotOrientation.VERTICAL, true, true, false);
        return Chart;
    }
    
    
    public static void saveToFile(JFreeChart chart, int width, int height, double quality)throws FileNotFoundException, IOException {
            
        BufferedImage img = draw(chart, width, height);
        File outputfile = new File(System.getProperty("user.dir") + "/" + ChartTitle + "_savedChart.png");
        ImageIO.write(img, "png", outputfile);

    }

    protected static BufferedImage draw(JFreeChart chart, int width, int height) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        chart.draw(g2, new Rectangle2D.Double(0, 0, width, height));
        g2.dispose();
        return img;
    }
}
