package moe;

import org.junit.jupiter.api.Test;

import moe.dazecake.inquisition.utils.Result;
import moe.dazecake.inquisition.service.impl.ImageServiceImpl;



public class ImageServiceImplTest {

    @Test
    public void testUploadImageToCos() {
        ImageServiceImpl imageService = new ImageServiceImpl();
        System.out.println("测试CHFS存储");

        // 调用 uploadImageToCos 方法并断言返回结果
        Result<String> result = imageService.uploadImageToCos("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDcuMC1jMDAwIDc5LmRhYmFjYmIsIDIwMjEvMDQvMTQtMDA6Mzk6NDQgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcD0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLyIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCAyMi40IChXaW5kb3dzKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpENzA4QzQzREY0NUYxMUVCQjIyMjkzMDJDMDVGNEUyNSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpENzA4QzQzRUY0NUYxMUVCQjIyMjkzMDJDMDVGNEUyNSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkQ3MDhDNDNCRjQ1RjExRUJCMjIyOTMwMkMwNUY0RTI1IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkQ3MDhDNDNDRjQ1RjExRUJCMjIyOTMwMkMwNUY0RTI1Ii8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+IgjW5AAAA1dJREFUeNpEk0tsG0Ucxn8zu2uvvX4kdkjSpG0EKRRIClI58BDigigg0UPPFY8KceGSigsIpCL1UOUAqIIbEkJBUCGuVC0SICFB4coBVWmaxEmM82riOPbau7Z3ZhgjJEbz0Dy++Wa+7/8XlRfbyD2DK0BIQQeOHyT6jaZKXknQU2mBKEl3c8xxbxak86XELGlssZ0o2M31J0K4Z1AubCv99p1+/P6Gak82TYzWfVL25LB0OOZkOOkW9u73cp8EQs5rbYwYErgD5tiCV3Ry9Y9ea27NNGjFLZJ+l1wAKWHYbffZdhx2s7mRBvddOZUanSlK73UjB7z22TWl3rrVa87d1fu02k2mT/mcu/gwEyc9+y1oVhN++XSZ2m87OPmOvVSdf8ydWPLxLssWZvx2L7q8rhuEnRazzwZ8eGOWdrLJwqVbLLz7K5XVZS589zgzZ8s0wjrVpMaOqr9n4CF3V6lXN1Q4HpsOmaziwkcP8MPCX3z7ToVixnJg2Li5QqsWc2b+NNd+3yKMGuzK3cyYHnpT1pP+2ZYVLOn2OHE6g8x1+fmzLUqFLNmsIQgUI6U0i1/X7KsiJp/Ko+IObX1Ix4QvyK5RD2r6OCohf1SwshqSHGjSrrIO/Ndkghsq1lZaOKMOrumhTUTPRFOugxGetcqXhlYYs74Z4VvlB2ueSPBM8q+VKUdT3YpQjQ5pqZAkCGNH6/FSzk59R9CsHHKvvUeuLPHU/+C0TsgUHLY7dbrL+/iePW/t8YS3Lied1PUxmSJvF6loVu9U0M9osjbYMj1Npp9gtaXxtE/17grBmhXbc8iJDBkZ/CjHnNRX025+uyQ9in2f1Pew5FnPX44IZySHj7rcfsnwZ1Dl+PUGwypN4KQZdspRWgRfuFkhth/xCpdaDH1eo0thf5TcjYTK1Bo7RUttbRyqwnMbRaa7JbKez4gsU3KOzEvhLon4yQi9B3/r8Opivza3r/bQKsKoDlq0rZiKPC6+ldt3PAsuMeGduJYXR15jSCrXDLJKG47J3MWcd3x5U/gf1MX+eNdJDVSw0IGVEEifkhw+KLuTH2dF+YrRwgxwIn4+xtRtUMpBFfSNOhrq9vm2aZ7p6WhWoqUvUouBzP2UkYVvHOEvm0EuD4iLgn8EGAAlVouD0ESFrAAAAABJRU5ErkJggg==");
        System.out.println(result);
    }
}
